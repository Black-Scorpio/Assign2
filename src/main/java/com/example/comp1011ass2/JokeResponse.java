package com.example.comp1011ass2;

public class JokeResponse {
    private int id;
    private String type, setup, punchline;

    public JokeResponse(int id, String type, String setup, String punchline) {
        setId(id);
        setType(type);
        setSetup(setup);
        setPunchline(punchline);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
