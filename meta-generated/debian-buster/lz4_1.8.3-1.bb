PACKAGES = "${PN} liblz4-1"
PROVIDES = "liblz4-1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lz4/liblz4-1_1.8.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblz4-1 = "liblz4-1_1.8.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6217a227a43eb430d8a3517aecf802a689760bf77e218a2f14f1dfdf3562d40f"
SRC_URI[deb0.md5sum] = "993c915d6c6c02b8bc7274ad34062ddf"

RDEPENDS_lib${PN}-1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblz4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1.8.3 \
    ./usr/share/doc/liblz4-1/changelog.Debian.gz \
    ./usr/share/doc/liblz4-1/copyright\
"
