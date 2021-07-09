PACKAGES = "${PN} python-certifi python3-certifi"
PROVIDES = "python-certifi python3-certifi"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python-certifi/python-certifi_2018.8.24-1_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/python-certifi/python3-certifi_2018.8.24-1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-certifi = "python-certifi_2018.8.24-1_all.deb"
SRC_URI[deb0.sha256sum] = "6f21069b969db1fad3d5626446c9d1e7a29cbb03ddb7c038e6b49785327fdbf8"
SRC_URI[deb0.md5sum] = "04f6add47a358f31fad5c685f72a4794"
DEBFILENAME_python3-certifi = "python3-certifi_2018.8.24-1_all.deb"
SRC_URI[deb1.sha256sum] = "59c6d276e4588841c6d221f319536850639096b5213790f4f864e1319a935e4b"
SRC_URI[deb1.md5sum] = "2da333f26e1286db3649ffa2daadffad"

RDEPENDS_${PN} = "ca-certificates python (<< 2.8) python (>= 2.6.6-7~) python (>= 2.7)"
RDEPENDS_python3-certifi = "ca-certificates python3 (>= 3.4~)"
DEPENDS = "ca-certificates python python3"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/python2.7/dist-packages/certifi-2018.8.24.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/certifi-2018.8.24.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/certifi-2018.8.24.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/certifi-2018.8.24.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/certifi/__init__.py \
    ./usr/lib/python2.7/dist-packages/certifi/__main__.py \
    ./usr/lib/python2.7/dist-packages/certifi/cacert.pem \
    ./usr/lib/python2.7/dist-packages/certifi/core.py \
    ./usr/share/doc/python-certifi/README.Debian \
    ./usr/share/doc/python-certifi/changelog.Debian.gz \
    ./usr/share/doc/python-certifi/copyright \
    ./usr/share/lintian/overrides/python-certifi\
"
FILES_python3-certifi = " \
    ./usr/lib/python3/dist-packages/certifi-2018.8.24.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/certifi-2018.8.24.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/certifi-2018.8.24.egg-info/not-zip-safe \
    ./usr/lib/python3/dist-packages/certifi-2018.8.24.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/certifi/__init__.py \
    ./usr/lib/python3/dist-packages/certifi/__main__.py \
    ./usr/lib/python3/dist-packages/certifi/cacert.pem \
    ./usr/lib/python3/dist-packages/certifi/core.py \
    ./usr/share/doc/python3-certifi/changelog.Debian.gz \
    ./usr/share/doc/python3-certifi/copyright \
    ./usr/share/lintian/overrides/python3-certifi\
"
