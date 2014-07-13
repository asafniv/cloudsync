package cloudsync.connector;

import java.io.InputStream;
import java.util.List;

import cloudsync.helper.CloudsyncException;
import cloudsync.helper.Structure;
import cloudsync.model.Item;

public interface RemoteConnector {

	public List<Item> readFolder(Structure structure, Item parentItem) throws CloudsyncException;

	public void upload(Structure structure, Item item) throws CloudsyncException;

	public void update(Structure structure, Item item, boolean with_filedata) throws CloudsyncException;

	public void remove(Structure structure, Item item) throws CloudsyncException;

	public InputStream get(Structure structure, Item item) throws CloudsyncException;

	public void cleanHistory(Structure structure, int history) throws CloudsyncException;
}