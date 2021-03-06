/*
 *  Copyright 2014 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beaker.table.serializer;

import com.twosigma.beaker.table.TableDisplay;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;

import java.io.IOException;

public abstract class ObservableTableDisplaySerializer<T extends TableDisplay> extends JsonSerializer<T> {

  protected void serialize(T tableDisplay, JsonGenerator jgen) throws IOException {
//    String id = updateManagerProvider.get().register(tableDisplay);
//    tableObjectManagerProvider.get().registerTableDisplay(id, tableDisplay);
//    jgen.writeStringField("update_id", id);
    jgen.writeBooleanField("hasDoubleClickAction", tableDisplay.hasDoubleClickAction());
    jgen.writeStringField("doubleClickTag", tableDisplay.getDoubleClickTag());
    jgen.writeObjectField("contextMenuItems", tableDisplay.getContextMenuItems());
    jgen.writeObjectField("contextMenuTags", tableDisplay.getContextMenuTags());
  }

}
