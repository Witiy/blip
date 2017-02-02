package ch.idsia.ipp.api.learn.solver.tw.brtl;


import ch.idsia.ipp.api.learn.solver.SolverApi;
import ch.idsia.ipp.core.learn.solver.brtl.BrutalGreedySolver;
import org.kohsuke.args4j.Option;


public abstract class TwSolverApi extends SolverApi {

    @Option(name="-w", required = true, usage="maximum treewidth")
    protected int tw;

    @Override
    public void exec() throws Exception {
        ((BrutalGreedySolver) solver).tw = tw;
        super.exec();
    }
}