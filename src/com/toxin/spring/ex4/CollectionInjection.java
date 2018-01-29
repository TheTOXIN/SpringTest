package com.toxin.spring.ex4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private List documentList;
    private Set documentSet;
    private Map documentMap;
    private Properties documentProp;

    public List getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List documentList) {
        System.out.println("List of DOCS: " + documentList);
        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        System.out.println("Set of DOCS: " + documentList);
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        System.out.println("Map of DOCS: " + documentList);
        this.documentMap = documentMap;
    }

    public Properties getDocumentProp() {
        return documentProp;
    }

    public void setDocumentProp(Properties documentProp) {
        System.out.println("Prop of DOCS: " + documentList);
        this.documentProp = documentProp;
    }
}
