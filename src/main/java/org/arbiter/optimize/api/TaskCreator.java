package org.arbiter.optimize.api;

import org.arbiter.optimize.api.data.DataProvider;
import org.arbiter.optimize.api.score.ScoreFunction;

import java.util.concurrent.Callable;

public interface TaskCreator<T,M,D,A> {
    Callable<OptimizationResult<T,M,A>> create(Candidate<T> candidate, DataProvider<D> dataProvider, ScoreFunction<M,D> scoreFunction );


}