package org.opensearch.plugin.analysis;

import org.opensearch.index.analysis.JasoTokenizerFactory;
import org.opensearch.index.analysis.*;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.plugins.Plugin;

import java.util.Map;

import org.opensearch.indices.analysis.AnalysisModule;

import static java.util.Collections.singletonMap;

import org.apache.lucene.analysis.Analyzer;
import org.opensearch.index.analysis.JasoAnalyzerProvider;

/**
 * JasoAnalysisPlugin
 *
 * @author 최일규
 * @since 2018-03-21
 */
public class JasoAnalysisPlugin extends Plugin implements AnalysisPlugin {

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        return singletonMap("jaso_tokenizer", JasoTokenizerFactory::new);
    }

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        return singletonMap("jaso_analyzer", JasoAnalyzerProvider::new);
    }
}