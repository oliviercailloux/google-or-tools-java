/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class AssignmentElement {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AssignmentElement(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AssignmentElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_AssignmentElement(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AssignmentElement() {
    this(operations_research_constraint_solverJNI.new_AssignmentElement(), true);
  }

  public void activate() {
    operations_research_constraint_solverJNI.AssignmentElement_activate(swigCPtr, this);
  }

  public void deactivate() {
    operations_research_constraint_solverJNI.AssignmentElement_deactivate(swigCPtr, this);
  }

  public boolean activated() {
    return operations_research_constraint_solverJNI.AssignmentElement_activated(swigCPtr, this);
  }

}