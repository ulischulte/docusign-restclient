/*******************************************************************************
     * Copyright 2012 Technology Blueprint Ltd
     * 
     * Licensed under the Apache License, Version 2.0 (the "License");
     * you may not use this file except in compliance with the License.
     * You may obtain a copy of the License at
     * 
     *   http://www.apache.org/licenses/LICENSE-2.0
     * 
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     ******************************************************************************/
package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ListCustomField extends BaseDto {

    private static final long serialVersionUID = 6676655454312514062L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("listItems")
    private List<String> listItems;

    @JsonProperty("value")
    private String value;

    @JsonProperty("required")
    private String required;

    @JsonProperty("show")
    private Boolean show;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(final String required) {
        this.required = required;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(final Boolean show) {
        this.show = show;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

}
