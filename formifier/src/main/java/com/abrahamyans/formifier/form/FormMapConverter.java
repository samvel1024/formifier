package com.abrahamyans.formifier.form;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Samvel Abrahamyan
 */
public class FormMapConverter implements Form<Map<String, Object>> {

    private List<Field<?, ?>> fields = new ArrayList<>();

    public FormMapConverter(List<Field<?, ?>> fields){
        this.fields = fields;
    }

    public FormMapConverter(){
        super();
    }

    public void addField(Field<?, ?> field){
        this.fields.add(field);
    }

    @Override
    public Map<String, Object> getForm() {
        Map<String, Object> values = new LinkedHashMap<>();
        for(Field<?, ?> f: fields)
            values.put(f.name(), f.getInput());
        return values;
    }

}
