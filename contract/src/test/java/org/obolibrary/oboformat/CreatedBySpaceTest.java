package org.obolibrary.oboformat;

import org.junit.Test;
import org.semanticweb.owlapi6.formats.OBODocumentFormat;

@SuppressWarnings({"javadoc"})
public class CreatedBySpaceTest extends OboFormatTestBasics {

    @Test
    public void testCreatedByWithSpace() {
        String input = "ontology: test\n[Typedef]\nid: R:1\nname: r1\ncreated_by: John Doe";
        loadOntologyFromString(input, df.generateDocumentIRI(), new OBODocumentFormat());
    }
}
