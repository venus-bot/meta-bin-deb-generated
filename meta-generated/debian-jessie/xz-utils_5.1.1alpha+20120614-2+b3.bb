PACKAGES = "${PN} liblzma5"
PROVIDES = "liblzma5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xz-utils/liblzma5_5.1.1alpha+20120614-2+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblzma5 = "liblzma5_5.1.1alpha+20120614-2+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e1aedd411106e35518dd9e26fc4dfe94890191e503149579ab54c3132e039bab"
SRC_URI[deb0.md5sum] = "407132733ece631e06ec04232e467ea4"

RDEPENDS_liblzma5 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_liblzma5 = " \
    ./lib/arm-linux-gnueabihf/liblzma.so.5 \
    ./lib/arm-linux-gnueabihf/liblzma.so.5.0.0 \
    ./usr/share/doc/liblzma5/AUTHORS \
    ./usr/share/doc/liblzma5/NEWS.gz \
    ./usr/share/doc/liblzma5/THANKS \
    ./usr/share/doc/liblzma5/changelog.Debian.armhf.gz \
    ./usr/share/doc/liblzma5/changelog.Debian.gz \
    ./usr/share/doc/liblzma5/changelog.gz \
    ./usr/share/doc/liblzma5/copyright\
"
