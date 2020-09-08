PACKAGES = "${PN} libjbig0"
PROVIDES = "libjbig0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/j/jbigkit/libjbig0_2.1-3.1+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjbig0 = "libjbig0_2.1-3.1+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "b50783fe5974f648125b6ce2487ba05f99e4f11929f5b75bdc5baa94890a563f"
SRC_URI[deb0.md5sum] = "9971c6acd7bcae6a048486ad2b1f52e4"

RDEPENDS_libjbig0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libjbig0 = " \
    ./usr/lib/arm-linux-gnueabihf/libjbig.so.0 \
    ./usr/share/doc/libjbig0/changelog.Debian.armhf.gz \
    ./usr/share/doc/libjbig0/changelog.Debian.gz \
    ./usr/share/doc/libjbig0/changelog.gz \
    ./usr/share/doc/libjbig0/copyright\
"
