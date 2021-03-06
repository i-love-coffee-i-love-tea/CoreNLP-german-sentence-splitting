package edu.stanford.nlp.coref;


import edu.stanford.nlp.util.logging.Redwood;

import java.io.IOException;

public class NeuralChineseCorefBenchmarkSlowITest extends CorefBenchmark {

  @Override
  public void setUp() throws Exception, IOException {
    logger = Redwood.channels(NeuralChineseCorefBenchmarkSlowITest.class);
    EXPECTED_F1_SCORE = 54.3;
    PROPERTIES_PATH =  "edu/stanford/nlp/coref/properties/neural-chinese.properties";
    WORK_DIR_NAME = "NeuralChineseCorefBenchmarkTest";
    testName = "Neural Chinese Coref";
    super.setUp();
  }

}
