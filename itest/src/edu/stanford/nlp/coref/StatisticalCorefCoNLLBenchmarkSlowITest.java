package edu.stanford.nlp.coref;


import edu.stanford.nlp.util.logging.Redwood;

import java.io.IOException;

public class StatisticalCorefCoNLLBenchmarkSlowITest extends CorefBenchmark {

  @Override
  public void setUp() throws Exception, IOException {
    logger = Redwood.channels(StatisticalCorefCoNLLBenchmarkSlowITest.class);
    EXPECTED_F1_SCORE = 63.27;
    PROPERTIES_PATH =  "edu/stanford/nlp/coref/properties/statistical-english-conll.properties";
    WORK_DIR_NAME = "StatisticalCorefBenchmarkTest";
    testName = "Statistical English Coref (CoNLL)";
    super.setUp();
  }

}
