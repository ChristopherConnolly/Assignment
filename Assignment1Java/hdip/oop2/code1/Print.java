/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdip.oop2.code1;

/**
 *
 * @author A00247198
 */
public abstract class Print implements NewsMedia {

    private String theName;

    Print(String name) {
        theName = name;
    }

    @Override
    public String getName() {
        return theName;
    }

    @Override
    public String toString() {
        return theName;
    }
}

class Tabloid extends Print {

    private String theEditor;

    Tabloid(String name, String editor) {
        super(name);
        Tabloid.this.theEditor = editor;

    }

    @Override
    public String getEditor() {
        return theEditor;
    }

    @Override
    public String toString() {
        return "Name is " + super.getName() + " whose editor is " + getEditor();
    }

}

class Broadsheet extends Print implements QualityJournalism {

    private String theEditor;

    Broadsheet(String name, String editor) {
        super(name);
        Broadsheet.this.theEditor = editor;
    }

    @Override
    public String getEditor() {
        return theEditor;
    }

    @Override
    public String toString() {
        return "Name is " + super.getName() + " whose editor is " + getEditor();
    }
}
