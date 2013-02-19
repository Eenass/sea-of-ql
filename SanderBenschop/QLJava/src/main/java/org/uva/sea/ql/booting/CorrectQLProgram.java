package org.uva.sea.ql.booting;

public final class CorrectQLProgram implements QLProgram {

    private final String code;

    public CorrectQLProgram(String code) {
        this.code = code;
    }

    @Override
    public boolean isCorrect() {
        return true;
    }

    @Override
    public String getGeneratedQLCode() {
        return code;
    }
}
