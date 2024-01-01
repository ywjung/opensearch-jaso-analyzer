package org.opensearch.analysis;

import junit.framework.TestCase;

/**
 * 자동완성 기능 유닛테스트
 *
 * @author 최일규
 * @since 2016-02-03
 */
public class JasoTest extends TestCase {

    public void testJasoDecomposer() {
        TokenizerOptions options = TokenizerOptions.create("testJasoDecomposer");
        options.setMistype(true);
        options.setChosung(true);

        JasoDecomposer aa = new JasoDecomposer();

        String expected = "ㅅㅅㄱㄱ";
        String actual = aa.runJasoDecompose("ㅆㄲ", options);
        assertEquals(expected, actual);
    }
}