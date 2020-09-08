PACKAGES = "${PN} x11proto-input-dev"
PROVIDES = "x11proto-input-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/x11proto-input/x11proto-input-dev_2.3.1-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-input-dev = "x11proto-input-dev_2.3.1-1_all.deb"
SRC_URI[deb0.sha256sum] = "a61a10b34cb0ffac6a2603971be1afd4908ed2830b6a1c554e74ac3321bb1e35"
SRC_URI[deb0.md5sum] = "1dd1b96c0b0b1286ef8cf4f27117edf8"

RDEPENDS_${PN}-dev = "x11proto-core-dev"
DEPENDS = "x11proto-core-dev"


inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/X11/extensions/XI.h \
    ./usr/include/X11/extensions/XI2.h \
    ./usr/include/X11/extensions/XI2proto.h \
    ./usr/include/X11/extensions/XIproto.h \
    ./usr/share/doc/x11proto-input-dev/XI2proto.html \
    ./usr/share/doc/x11proto-input-dev/XI2proto.txt.gz \
    ./usr/share/doc/x11proto-input-dev/XIproto.html \
    ./usr/share/doc/x11proto-input-dev/XIproto.txt.gz \
    ./usr/share/doc/x11proto-input-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-input-dev/changelog.gz \
    ./usr/share/doc/x11proto-input-dev/copyright \
    ./usr/share/pkgconfig/inputproto.pc\
"
