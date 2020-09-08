PACKAGES = "${PN} libkeyutils1"
PROVIDES = "libkeyutils1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/k/keyutils/libkeyutils1_1.6-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libkeyutils1 = "libkeyutils1_1.6-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "6b7aa138993d17d3bb526b22b6fc5ad41e12dfb1500b4276c5708c315b6b2983"
SRC_URI[deb0.md5sum] = "af8839ae3d003ab79fac8136d3df19f7"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libkeyutils1 = " \
    ./lib/arm-linux-gnueabihf/libkeyutils.so.1 \
    ./lib/arm-linux-gnueabihf/libkeyutils.so.1.8 \
    ./usr/share/doc/libkeyutils1/changelog.Debian.gz \
    ./usr/share/doc/libkeyutils1/copyright\
"
