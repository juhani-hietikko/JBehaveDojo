package com.houston.jbehavedojo.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromURL;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import com.houston.jbehavedojo.steps.TrafficLightSteps;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;


@RunWith(JUnitReportingRunner.class)
public class Stories extends JUnitStories {
    
    public Stories() {
        configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(true).useThreads(2).useStoryTimeoutInSecs(60);
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
        .useStoryLoader(new LoadFromURL())  
        .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.TXT)); 
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new TrafficLightSteps());
    }

    @Override
    protected List<String> storyPaths() {
        final String STORY_PATH = 
                "/Users/juhani/Documents/workspace/JBehaveDojo/jbehavedojo/src/test/java/com/houston/jbehavedojo/stories/";
        return new StoryFinder().findPaths(STORY_PATH, Arrays.asList("*.story"), null, "file://" + STORY_PATH);
    }       
}