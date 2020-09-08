PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/p11-kit/libp11-kit0_0.23.15-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.23.15-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "56de64f62447b20b4f24f3c1d5cf2036f0971f22e1e820e25ff16b8cf59a7490"
SRC_URI[deb0.md5sum] = "97bb8763031cc71ab965ab7d2a8ccee5"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libffi6 (>= 3.0.4)"
DEPENDS = "libc6 libffi6"


inherit deb_group

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.3.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
