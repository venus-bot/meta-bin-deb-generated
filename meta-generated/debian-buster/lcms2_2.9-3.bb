PACKAGES = "${PN} liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lcms2/liblcms2-2_2.9-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.9-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "6994b634f7b90cc9386671c39623a686c456c450f21a245f3f5abda960c612af"
SRC_URI[deb0.md5sum] = "2a7aebe477aaa76bdec45ae23c223973"

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
