PACKAGES = "${PN} libxrender1"
PROVIDES = "libxrender1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxrender/libxrender1_0.9.10-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxrender1 = "libxrender1_0.9.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "82343e14e073be48577ae1c2c5f95886bc2dddf9a1966b77ba76a827a8e62e44"
SRC_URI[deb0.md5sum] = "993d02357ecc1974fc71e0294c4c8280"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libc6 libx11-6"


inherit deb_group

FILES_libxrender1 = " \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1.3.0 \
    ./usr/share/doc/libxrender1/changelog.Debian.gz \
    ./usr/share/doc/libxrender1/changelog.gz \
    ./usr/share/doc/libxrender1/copyright\
"
