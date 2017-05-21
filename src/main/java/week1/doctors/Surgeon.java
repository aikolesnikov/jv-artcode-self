package week1.doctors;

/**
 * first one
 */
abstract class Surgeon implements IDoctor {
    int surgeonExperience;

    abstract String performOperaion(String opKind);
}


