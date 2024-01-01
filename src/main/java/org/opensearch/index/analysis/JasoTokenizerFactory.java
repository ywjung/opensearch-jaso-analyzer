package org.opensearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.opensearch.analysis.JasoTokenizer;
import org.opensearch.analysis.TokenizerOptions;
import org.opensearch.common.settings.Settings;
import org.opensearch.index.IndexSettings;
import org.opensearch.env.Environment;
import org.opensearch.index.analysis.AbstractTokenizerFactory;

/**
 * JasoTokenizerFactory
 *
 * @author 최일규
 * @since 2018-03-21
 */
public class JasoTokenizerFactory extends AbstractTokenizerFactory {

    private final TokenizerOptions options;

    public JasoTokenizerFactory(IndexSettings indexSettings,
                                Environment environment,
                                String name,
                                Settings settings) {

        super(indexSettings, settings, name);

        this.options = TokenizerOptions.create(name);
        this.options.setMistype(settings.getAsBoolean("mistype", TokenizerOptions.MISTYPE));
        this.options.setChosung(settings.getAsBoolean("chosung", TokenizerOptions.CHOSUNG));
    }

    @Override
    public Tokenizer create() {
        return new JasoTokenizer(this.options);
    }
}