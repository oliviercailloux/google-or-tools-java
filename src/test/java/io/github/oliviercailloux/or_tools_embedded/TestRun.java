package io.github.oliviercailloux.or_tools_embedded;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.ortools.linearsolver.MPConstraint;
import com.google.ortools.linearsolver.MPObjective;
import com.google.ortools.linearsolver.MPSolver;
import com.google.ortools.linearsolver.MPSolver.OptimizationProblemType;
import com.google.ortools.linearsolver.MPVariable;

class TestRun {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(TestRun.class);

	/**
	 * Adapted from https://developers.google.com/optimization/introduction/using
	 *
	 */
	public void linear() {
		final MPSolver solver = new MPSolver("LinearExample", OptimizationProblemType.GLOP_LINEAR_PROGRAMMING);
		final double infinity = MPSolver.infinity();

		// x is a continuous non-negative variable
		final MPVariable x = solver.makeNumVar(0.0, infinity, "x");

		// Maximize x
		final MPObjective objective = solver.objective();
		objective.setCoefficient(x, 1);
		objective.setMaximization();

		// x <= 10
		final MPConstraint c = solver.makeConstraint(-infinity, 10.0);
		c.setCoefficient(x, 1);

		solver.solve();

		assertEquals(1, solver.numVariables());
		assertEquals(1, solver.numConstraints());
		assertEquals(10, solver.objective().value());
		assertEquals(10, x.solutionValue());
	}

	@Test
	void test() {
		LOGGER.info("Loading native library jniortools.");
		System.loadLibrary("jniortools");
		LOGGER.info("Running the stuff.");
		linear();
	}

}
