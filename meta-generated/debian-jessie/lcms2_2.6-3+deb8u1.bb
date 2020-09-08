PACKAGES = "${PN} liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lcms2/liblcms2-2_2.6-3+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.6-3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6b3b9e3dc7cb999c9bf38d6ebe120bd4ce7527ec98f4d329f41cd80c60f1139f"
SRC_URI[deb0.md5sum] = "450b7b55a40636fb180e2882eb3d6492"

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
