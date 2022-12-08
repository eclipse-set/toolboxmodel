# Build instructions

As the requirements for local development and production deployments are different, this document contains two sets of instructions. First, instructions on how to work on the component locally using the Eclipse IDE (e.g. for development) and secondly how to do a full production build locally via Maven.

## Prerequisites

- A Java Development Kit 17 (or higher)
- Maven (3.8+) 
- Eclipse IDE (2022-06+)

# Development

This is the recommended way to build and debug for development. 

1. Create a new workspace in the Eclipse IDE
2. Import projects from `java/` via File -> Import -> Existing Projects into Workspace
3. Import the Checkstyle configuration from the SET repository (`releng/eclipse/CheckstyleEclipse.xml`) via Window -> Preferences -> Checkstyle
4. Build all projects

# Production build

This is the recommended way if you want a production-style build. This is also what we have implemented on the Jenkins instance. 

1. If you want to do a build relying on a build of the model component, update the target platform in `java/bundles/org.eclipse.set.toolboxmodel.releng.target` to point to your local p2 site. 
2. Build via maven: `mvn clean verify`

The p2 site for the model is now located in `java\bundles\org.eclipse.set.model.releng.repository\target\repository`. 