/**
 * abstract system
 */
abstract class s001System {
    private String name;

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    /**
     * material systems
     */
    abstract static class s011Material extends s001System {
        s011Material(){}
    }

    /**
     * material systems
     */
    abstract static class s021NonMaterial extends s001System{
        s021NonMaterial(){}
    }

    /**
     * organic
     */
    static class s101MaterialOrganic {
    }

    /**
     * nonorganic
     */
    static class s102MaterialNonOrganic {
    }

    /**
     * Created by artyom.kolesnikov on 5/22/2017.
     */
    static class s1001OrganicFauna extends s101MaterialOrganic {
    }

    /**
     * Created by artyom.kolesnikov on 5/22/2017.
     */
    static class s1002OrganicFlora extends s101MaterialOrganic {
    }
}

