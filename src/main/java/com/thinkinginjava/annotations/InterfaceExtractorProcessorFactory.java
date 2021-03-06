/*package com.thinkinginjava.annotations;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    public AnnotationProcessor getProcessorFor(
            Set<AnnotationTypeDeclaration> atds,
            AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }

    public Collection<String> supportedAnnotationTypes() {
        return
                Collections.singleton("com.thinkinginjava.annotations.ExtractInterface");
    }

    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
} */
