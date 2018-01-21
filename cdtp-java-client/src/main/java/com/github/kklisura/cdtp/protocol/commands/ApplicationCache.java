package com.github.kklisura.cdtp.protocol.commands;

import com.github.kklisura.cdtp.protocol.annotations.Experimental;
import com.github.kklisura.cdtp.protocol.types.applicationcache.FrameWithManifest;
import java.util.List;

@Experimental
public interface ApplicationCache {

	/**
	 * Returns array of frame identifiers with manifest urls for each frame containing a document associated with some application cache.
	 */
	List<FrameWithManifest> getFramesWithManifests();

	/**
	 * Enables application cache domain notifications.
	 */
	void enable();

	/**
	 * Returns manifest URL for document in the given frame.
	 */
	String getManifestForFrame(String frameId);

	/**
	 * Returns relevant application cache data for the document in given frame.
	 */
	com.github.kklisura.cdtp.protocol.types.applicationcache.ApplicationCache getApplicationCacheForFrame(String frameId);
}