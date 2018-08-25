package models;

public enum ArticleFormat {
    EDITORIAL("Editorial"),
    OPED("Op-Ed"),
    LETTER("Letter"),
    FEATURE("Feature"),
    COLUMN("Column"),
    SPONSORED("Sponsored"),
    INTERVIEW("Interview");

    private final String humanReadable;
    ArticleFormat(String humanReadable) {
        this.humanReadable = humanReadable;
    }

    public String getHumanReadable() {
        return humanReadable;
    }
}
