PACKAGES = "${PN} base-files"
PROVIDES = "base-files"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/base-files/base-files_10.3+deb10u13_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-files = "base-files_10.3+deb10u13_armhf.deb"
SRC_URI[deb0.sha256sum] = "d0ae82d72c1cb8708a5a144d82db4ced6d85827ee3b8235cfa0fa5c089a98310"
SRC_URI[deb0.md5sum] = "ae35b8e264c47fa6e51dcc3ac77ca0ca"

RDEPENDS_${PN} = "awk"
DEPENDS = "awk"


inherit deb_group

FILES_${PN} = " \
    ./etc/debian_version \
    ./etc/dpkg/origins/debian \
    ./etc/host.conf \
    ./etc/issue \
    ./etc/issue.net \
    ./etc/os-release \
    ./etc/update-motd.d/10-uname \
    ./usr/lib/os-release \
    ./usr/share/base-files/dot.bashrc \
    ./usr/share/base-files/dot.profile \
    ./usr/share/base-files/dot.profile.md5sums \
    ./usr/share/base-files/info.dir \
    ./usr/share/base-files/motd \
    ./usr/share/base-files/profile \
    ./usr/share/base-files/profile.md5sums \
    ./usr/share/base-files/staff-group-for-usr-local \
    ./usr/share/common-licenses/Apache-2.0 \
    ./usr/share/common-licenses/Artistic \
    ./usr/share/common-licenses/BSD \
    ./usr/share/common-licenses/CC0-1.0 \
    ./usr/share/common-licenses/GFDL \
    ./usr/share/common-licenses/GFDL-1.2 \
    ./usr/share/common-licenses/GFDL-1.3 \
    ./usr/share/common-licenses/GPL \
    ./usr/share/common-licenses/GPL-1 \
    ./usr/share/common-licenses/GPL-2 \
    ./usr/share/common-licenses/GPL-3 \
    ./usr/share/common-licenses/LGPL \
    ./usr/share/common-licenses/LGPL-2 \
    ./usr/share/common-licenses/LGPL-2.1 \
    ./usr/share/common-licenses/LGPL-3 \
    ./usr/share/common-licenses/MPL-1.1 \
    ./usr/share/common-licenses/MPL-2.0 \
    ./usr/share/doc/base-files/FAQ \
    ./usr/share/doc/base-files/README \
    ./usr/share/doc/base-files/README.FHS \
    ./usr/share/doc/base-files/changelog.gz \
    ./usr/share/doc/base-files/copyright \
    ./usr/share/lintian/overrides/base-files\
"
