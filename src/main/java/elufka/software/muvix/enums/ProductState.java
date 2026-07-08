package elufka.software.muvix.enums;

public enum ProductState {
    EXCELENTE("Excelente"),
    BUEN_ESTADO("Buen estado"),
    USADO_COMO_NUEVO("Usado como nuevo"),
    PARA_REPUESTOS("Para Repuestos");

    private String label;

    ProductState(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
