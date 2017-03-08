package au.edu.qut.processmining.miners.yam.ui.dfgp;

import org.deckfour.uitopia.api.event.TaskListener;
import org.processmining.contexts.uitopia.UIPluginContext;

import java.util.concurrent.CancellationException;

/**
 * Created by Adriano on 23/01/2017.
 */
public class DFGPUI {

    public DFGPUIResult showGUI(UIPluginContext context, String title) {

        DFGPSettings dfgpSettings = new DFGPSettings();
        TaskListener.InteractionResult guiResult = context.showWizard(title, true, true, dfgpSettings);

        if( guiResult == TaskListener.InteractionResult.CANCEL ) {
            context.getFutureResult(0).cancel(true);
            throw new CancellationException("The wizard has been cancelled.");
        }

        return dfgpSettings.getSelections();
    }
}