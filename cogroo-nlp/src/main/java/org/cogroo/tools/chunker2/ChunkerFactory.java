/**
 * Copyright (C) 2012 cogroo <cogroo@cogroo.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cogroo.tools.chunker2;

import opennlp.tools.util.BaseToolFactory;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.SequenceValidator;
import opennlp.tools.util.ext.ExtensionLoader;

import org.cogroo.tools.featurizer.WordTag;

public class ChunkerFactory extends BaseToolFactory {

  /**
   * Creates a {@link ChunkerFactory} that provides the default implementation
   * of the resources.
   */
  public ChunkerFactory() {
  }

  public static ChunkerFactory create(String subclassName)
      throws InvalidFormatException {
    if (subclassName == null) {
      // will create the default factory
      return new ChunkerFactory();
    }
    try {
      ChunkerFactory theFactory = ExtensionLoader.instantiateExtension(
          ChunkerFactory.class, subclassName);
      return theFactory;
    } catch (Exception e) {
      String msg = "Could not instantiate the " + subclassName
          + ". The initialization throw an exception.";
      System.err.println(msg);
      e.printStackTrace();
      throw new InvalidFormatException(msg, e);
    }
  }

  @Override
  public void validateArtifactMap() throws InvalidFormatException {
    // no additional artifacts
  }

  public SequenceValidator<WordTag> getSequenceValidator() {
    return new DefaultChunkerSequenceValidator();
  }

  public ChunkerContextGenerator getContextGenerator() {
    return new DefaultChunkerContextGenerator();
  }
}
