package org.opensearch.index.analysis;

import org.opensearch.analysis.JasoAnalyzer;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractIndexAnalyzerProvider;

/**
 * JasoAnalyzerProvider
 *
 * @author 최일규
 * @since 2018-03-21
 */
public class JasoAnalyzerProvider extends AbstractIndexAnalyzerProvider<JasoAnalyzer> {
    private final JasoAnalyzer analyzer;

    public JasoAnalyzerProvider(IndexSettings indexSettings, Environment environment, String name, Settings settings) {
        super(indexSettings, name, settings);
        analyzer = new JasoAnalyzer();
    }

    @Override
    public JasoAnalyzer get() {
        return analyzer;
    }
}