# Eclipse Signalling Engineering Toolbox - Toolbox Model

This repository contains the source code for the toolbox model subcomponent of the 
Eclipse Signalling Engineering Toolbox. The toolbox model is an EMF data model, 
which is based on the main PlanPro-derived data model. The main goal of this 
additional modelling layer is to adapt the subject-specific data structures in the
PlanPro model into equivalent structures that are easier and faster to process in 
an EMF-based application. 

To facilitate this goal, the toolbox model is derived using a set of XSLT 
transformations which have a corresponding Java transformation. The Java 
transformation ensures bidirectional translation between the model and the 
toolbox model. 

For more details on the Eclipse Signalling Engineering Toolbox project, please see

* https://projects.eclipse.org/projects/technology.set

# Contributing

If you are interested in contributing, please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

# Build instructions

For detailed build instructions see [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md).
