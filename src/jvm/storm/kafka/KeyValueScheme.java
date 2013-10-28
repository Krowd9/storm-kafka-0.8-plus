package storm.kafka;

import backtype.storm.spout.MultiScheme;

public interface KeyValueScheme extends MultiScheme {
  public java.lang.Iterable<java.util.List<java.lang.Object>> deserializeKeyValue(byte[] key, byte[] value);
}
