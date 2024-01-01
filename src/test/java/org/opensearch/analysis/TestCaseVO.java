package org.opensearch.analysis;

/**
 * 테스트케이스 VO
 *
 * @author 최일규
 * @since 2016-02-13
 */
public class TestCaseVO {

    private final String origin;
    private final String compare;

    public TestCaseVO(String origin, String compare) {
        this.origin = origin;
        this.compare = compare;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCompare() {
        return compare;
    }
}
