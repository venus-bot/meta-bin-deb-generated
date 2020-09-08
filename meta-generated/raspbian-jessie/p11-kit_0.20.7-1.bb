PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/p11-kit/libp11-kit0_0.20.7-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.20.7-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b6c6f686c0c91f84a3ce1ffc5dab87dd8b04e506203852b2f98177bff2f6355b"
SRC_URI[deb0.md5sum] = "6e0651809666feb291e2a029fa274d74"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.16) libffi6 (>= 3.0.4) multiarch-support"
DEPENDS = "libc6 libffi6 multiarch-support"


inherit deb_group

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.0.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
