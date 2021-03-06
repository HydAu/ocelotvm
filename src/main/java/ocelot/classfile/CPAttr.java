package ocelot.classfile;

/**
 *
 * @author ben
 */
public class CPAttr {

    private int nameIndex;
    private String name = "tmp";

    public CPAttr(int name_idx) {
        nameIndex = name_idx;
    }

    @Override
    public String toString() {
        return "Attr{" + "nameIndex=" + nameIndex + ", name=" + name + '}';
    }
}

class ConstantValueAttr extends CPAttr {

    public ConstantValueAttr(int index) {
        super(index);
    }

}

class CodeAttr extends CPAttr {
    public CodeAttr(int index) {
        super(index);
    }
}

class ExceptionsAttr extends CPAttr {
    public ExceptionsAttr(int index) {
        super(index);
    }
}
