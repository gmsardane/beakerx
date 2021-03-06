/*
 *  Copyright 2017 TWO SIGMA OPEN SOURCE, LLC
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
package com.twosigma.beaker.widgets;

import java.io.Serializable;
import java.util.HashMap;

public abstract class BeakerxWidget extends Widget{

  public static final String MODEL_MODULE_VALUE = "beakerx";
  public static final String VIEW_MODULE_VALUE = "beakerx";
  public static final String MODEL = "model";

  @Override
  public void beforeDisplay() {
    if (getComm() != null) {
      getComm().sendUpdate(MODEL, SerializeToJson.toJson(this));
    }
  }

  @Override
  protected void addValueChangeMsgCallback() {
  }

  @Override
  protected HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    return content;
  }

  @Override
  public String getModelModuleValue() {
    return BeakerxWidget.MODEL_MODULE_VALUE;
  }

  @Override
  public String getViewModuleValue() {
    return BeakerxWidget.VIEW_MODULE_VALUE;
  }


}
