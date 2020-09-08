PACKAGES = "${PN} liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lcms2/liblcms2-2_2.6-3+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.6-3+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f9a779b037bee266a94f6c186198ce3f39825d3bd5a48f060856f0f9bb78e791"
SRC_URI[deb0.md5sum] = "fc8427bd11fa42ebe93dda970588edfc"

RDEPENDS_lib${PN}-2 = "libc6 (>= 2.7) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_liblcms2-2 = " \
    ./usr/lib/arm-linux-gnueabihf/liblcms2.so.2 \
    ./usr/lib/arm-linux-gnueabihf/liblcms2.so.2.0.6 \
    ./usr/share/doc/liblcms2-2/changelog.Debian.gz \
    ./usr/share/doc/liblcms2-2/changelog.gz \
    ./usr/share/doc/liblcms2-2/copyright\
"
