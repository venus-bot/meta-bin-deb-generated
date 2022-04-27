PACKAGES = "${PN} liblzma5"
PROVIDES = "liblzma5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xz-utils/liblzma5_5.2.4-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblzma5 = "liblzma5_5.2.4-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "4224e2b97e530308a85211fc07a8a0629569f23e8c24bf8d01cb30eea8364419"
SRC_URI[deb0.md5sum] = "7568a281ae32674334077278f50d0113"

RDEPENDS_liblzma5 = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblzma5 = " \
    ./lib/arm-linux-gnueabihf/liblzma.so.5 \
    ./lib/arm-linux-gnueabihf/liblzma.so.5.2.4 \
    ./usr/share/doc/liblzma5/AUTHORS \
    ./usr/share/doc/liblzma5/NEWS.gz \
    ./usr/share/doc/liblzma5/THANKS \
    ./usr/share/doc/liblzma5/changelog.Debian.gz \
    ./usr/share/doc/liblzma5/changelog.gz \
    ./usr/share/doc/liblzma5/copyright\
"
