PACKAGES = "${PN} libpng12-0"
PROVIDES = "libpng12-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpng/libpng12-0_1.2.50-2+deb8u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpng12-0 = "libpng12-0_1.2.50-2+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "ab9382787c8a47c40528db5d904e249943de75b47188d9f30084f1ac1631f0aa"
SRC_URI[deb0.md5sum] = "998c42e59d4b7062df901efa0c61df65"

RDEPENDS_${PN}12-0 = "libc6 (>= 2.11) multiarch-support zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 multiarch-support zlib1g"


inherit deb_group

FILES_libpng12-0 = " \
    ./lib/arm-linux-gnueabihf/libpng12.so.0 \
    ./lib/arm-linux-gnueabihf/libpng12.so.0.50.0 \
    ./usr/lib/arm-linux-gnueabihf/libpng12.so.0 \
    ./usr/share/doc-base/libpng12 \
    ./usr/share/doc/libpng12-0/ANNOUNCE \
    ./usr/share/doc/libpng12-0/KNOWNBUG \
    ./usr/share/doc/libpng12-0/README.Debian \
    ./usr/share/doc/libpng12-0/README.gz \
    ./usr/share/doc/libpng12-0/TODO \
    ./usr/share/doc/libpng12-0/changelog.Debian.gz \
    ./usr/share/doc/libpng12-0/changelog.gz \
    ./usr/share/doc/libpng12-0/copyright \
    ./usr/share/doc/libpng12-0/libpng-1.2.50.txt.gz\
"
