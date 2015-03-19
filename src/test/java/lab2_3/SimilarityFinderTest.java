package lab2_3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.iis.mto.dublers.SequenceSearcherDubler;
import edu.iis.mto.similarity.SimilarityFinder;

public class SimilarityFinderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void similarityFinder_shouldBeEquals025() {
		SequenceSearcherDubler searcher = new SequenceSearcherDubler();
		SimilarityFinder similarityFinder = new SimilarityFinder(searcher);
		
		int[] seq1 = {1,5,3,5,8};
		int[] seq2 = {2,3,4,7,8};
		
		double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);
		assertThat(result, is(0.25d));
	}

	@Test
	public void similarityFinder_shouldBeNotEquals1() {
		SequenceSearcherDubler searcher = new SequenceSearcherDubler();
		SimilarityFinder similarityFinder = new SimilarityFinder(searcher);
		
		int[] seq1 = {1,5,3,5,8};
		int[] seq2 = {2,3,4,7,8};
		
		double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);
		assertThat(result, is(not(1.0d)));
	}
}
