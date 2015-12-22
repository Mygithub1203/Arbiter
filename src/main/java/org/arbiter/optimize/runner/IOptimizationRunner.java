package org.arbiter.optimize.runner;

import org.arbiter.optimize.api.OptimizationResult;
import org.arbiter.optimize.api.saving.ResultReference;
import org.arbiter.optimize.config.OptimizationConfiguration;
import org.arbiter.optimize.runner.listener.StatusListener;

import java.util.List;

public interface IOptimizationRunner<C,M,A> {

    void execute();

    /** Total number of candidates: created (scheduled), completed and failed */
    int numCandidatesScheduled();

    int numCandidatesCompleted();

    int numCandidatesFailed();

    /** Best score found so far */
    double bestScore();

    /** Time that the best score was found at, or 0 if no jobs have completed successfully */
    long bestScoreTime();

    List<ResultReference<C,M,A>> getResults();

    OptimizationConfiguration<C,M,?,A> getConfiguration();

    void addListeners(StatusListener... listeners);

    void removeListeners(StatusListener... listeners);

    void removeAllListeners();

    List<CandidateStatus> getCandidateStatus();

}