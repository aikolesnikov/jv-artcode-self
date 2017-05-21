package week1.doctors;

/**
 * first one
 */
public abstract class Surgeon extends Doctor implements IDoctor {
    int surgeonExperience;

    abstract String performOperaion(String opKind);
}


