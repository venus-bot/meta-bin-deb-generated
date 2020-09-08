PACKAGES = "${PN} liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lcms2/liblcms2-2_2.9-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.9-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "6d771698dd7b90af8f53d744775ad0f8a669be7a5ee8bf2c285f7bced0c64822"
SRC_URI[deb0.md5sum] = "540c3f5d4328eb7ef8ef30033bfc3edf"

RDEPENDS_lib${PN}-2 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblcms2-2 = " \
    ./usr/lib/arm-linux-gnueabihf/liblcms2.so.2 \
    ./usr/lib/arm-linux-gnueabihf/liblcms2.so.2.0.8 \
    ./usr/share/doc/liblcms2-2/changelog.Debian.gz \
    ./usr/share/doc/liblcms2-2/changelog.gz \
    ./usr/share/doc/liblcms2-2/copyright\
"
