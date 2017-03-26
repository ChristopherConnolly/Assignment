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
public abstract class Online implements NewsMedia {

    String theName;

    Online(String name) {
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

class Blog extends Online {

    private String theEditor;

    Blog(String name, String editor) {
        super(name);
        Blog.super.theName = name;
        Blog.this.theEditor = editor;

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

class SubscriptionService extends Online implements QualityJournalism {

    private String theEditor;

    SubscriptionService(String name, String editor) {
        super(name);
        SubscriptionService.super.theName = name;
        SubscriptionService.this.theEditor = editor;
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
