package homework10;

public class RequiredFields {
    private String fieldName;
    private int fieldLength;
    private boolean isRequired;

    public RequiredFields (String name, int length, boolean required) {
        this.fieldName = name;
        this.fieldLength = length;
        this.isRequired = required;
    }
    public void typeFieldInfo() {
        if (isRequired == false) {
            System.out.println(fieldName + "\n" + fieldLength + "\n" + isRequired + "\n" +"It is required field");
        } else {
            System.out.println(fieldName + "\n" + fieldLength + "\n" + isRequired);
        }
    }

    public RequiredFields() {
    }

    public void setFieldLength(int fieldLength) {
        this.fieldLength = fieldLength;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public int getFieldLength() {
        return fieldLength;
    }

    public String getFieldName() {
        return fieldName;
    }

}
